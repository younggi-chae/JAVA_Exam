function PhoneInfo(name, tel){
	var name = name; // 캡슐화, set get함수 생성
	var tel = tel;
	
	this.getName = function(){
		return name;
	}
	
	this.setName = function(name){
		name = name;
	}
	
	this.getTel = function(){
		return tel;
	}
	
	this.setTel = function(tel2){	
		tel = tel2;
	}
	this.toString = function(){
		return this.getName() + "\t" + this.getTel()
	}
}
