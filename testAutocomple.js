function hideDestroyButton(){
	var destroyButton = document.getElementById("destroyButton");
	var inform = document.getElementById("inform").value;
	if("Đang xử lí" === inform){
		destroyButton.style.display = block;
	}else{
		destroyButton.style.display = none;
	}
}

// Sử dụng trong onload của thẻ chứa thông báo