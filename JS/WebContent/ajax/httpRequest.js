function getXMLHttpRequest() {
	if (window.ActiveXObject) {   //구형 브라우저
		try {
			return new ActiveXObject("Msxml2.XMLHTTP");
		} catch(e) {
			try {
				return new ActiveXObject("Microsoft.XMLHTTP");
			} catch(e1) { return null; }
		}
	} else if (window.XMLHttpRequest) {  //신형 브라우저
		return new XMLHttpRequest();
	} else {
		return null;
	}
}
var httpRequest = null;

function sendRequest(url, params, callback, method) { //서버url, 서버에게 가져가야할 데이터값, 콜백함수, get/post메서드
	httpRequest = getXMLHttpRequest();
	var httpMethod = method ? method : 'GET';  // 기본값은 get
	if (httpMethod != 'GET' && httpMethod != 'POST') {
		httpMethod = 'GET';
	}
	var httpParams = (params == null || params == '') ? null : params;
	var httpUrl = url;
	if (httpMethod == 'GET' && httpParams != null) {
		httpUrl = httpUrl + "?" + httpParams;
	}
	httpRequest.open(httpMethod, httpUrl, true); //true는 비동기식
	httpRequest.setRequestHeader(
		'Content-Type', 'application/x-www-form-urlencoded');
	httpRequest.onreadystatechange = callback;  //콜백함수 등록(onreadystatechange)
	httpRequest.send(httpMethod == 'POST' ? httpParams : null); //post방식
}
















