

$(document).ready(function() {
/* let newFile=document.createElement('input');
newFile.type="file";
newFile.id="file";
//newFile.style.display='none';
newFile.name='file';
newFile.addEventListener('change',showImage);
let file=document.getElementById("file");
document.getElementById('file').parentNode.replaceChild(newFile,file); */
document.getElementById("file").value="";
//alert(document.getElementById("submit").value);
  let thongBao = document.getElementById("thongBao");
  if (thongBao.value == "Ảnh đã tồn tại!"){
    $('#myModal').modal();
    document.getElementById("hienThongBao").innerHTML=thongBao.value;
    thongBao.value = "";
  }
  if (thongBao.value == "Thêm thành công!"){
    resetModal();
    $('#myModal').modal();
    thongBao.value = "";
  }
  if(thongBao.value=="Xóa thành công!" || thongBao.value=="Thay đổi thành công!")
    alert(thongBao.value);
  if(thongBao.value=="Thất bại"){
    document.getElementById("hienThongBao").innerHTML=thongBao.value;
    $('#myModal').modal();
  }

});
function closingModal(){
  document.getElementById("hienThongBao").innerHTML=null;
  //resetModal();
}
$("#myModal").on("hidden.bs.modal",closingModal);
function them() {
  document.getElementById("submit").value = "Thêm Mới";
  document.getElementById("reset").style.display = "inline";
  document.getElementById("themAnh").style.display = "inline";
  document.getElementById("title").innerHTML = "Thêm mới thương hiệu";
  forAdd();
  resetModal();
  $('#myModal').modal();
}

function sua(div) {
  document.getElementById("submit").value = "Thay đổi";
  document.getElementById("themAnh").value = "Thay ảnh";
  document.getElementById("reset").style.display = "none";
  document.getElementById("title").innerHTML = "Thay đổi thông tin thương hiệu";
  forEdit(div);
  $('#myModal').modal();
}

function xoa(div) {

  document.getElementById("submit").value = "Xóa";
  document.getElementById("themAnh").style.display = "none";
  document.getElementById("reset").style.display = "none";
  document.getElementById("title").innerHTML = "Xóa thương hiệu";
  forDelete(div);
  $('#myModal').modal();
}
function forDelete(div) {

  var mortherDiv = div.parentNode.parentNode;
  let src=mortherDiv.getElementsByTagName("img")[0].src;
  document.getElementById("img").src = src;
  document.getElementById("forEditDelete").value = src;
  var texts = mortherDiv.getElementsByTagName("label");
  var labels = document.getElementsByClassName("hiddens");
  labels[0].innerHTML=texts[4].innerHTML;
  labels[1].innerHTML=texts[5].innerHTML;
  labels[2].innerHTML=texts[6].innerHTML;
  labels[3].innerHTML=texts[7].innerHTML;
  labels[0].style.display = "inline";
  labels[1].style.display = "inline";
  labels[2].style.display = "inline";
  labels[3].style.display = "inline";
  document.getElementById("maTH").value=texts[4].innerHTML;
  document.getElementById("maTH").style.display = "none";
  document.getElementById("tenTH").style.display = "none";
  document.getElementById("truSo").style.display = "none";
  document.getElementById("website").style.display = "none";
}
function resetModal(){
  alert("eeee");
  document.getElementById("maTH").value = "";
  document.getElementById("tenTH").value = "";
  document.getElementById("truSo").value = "";
  document.getElementById("website").value = "";
}
function forAdd() {
  document.getElementById("img").src = document.getElementById("keeper").value;
  var labels = document.getElementsByClassName("hiddens");
  labels[0].style.display = "none";
  labels[1].style.display = "none";
  labels[2].style.display = "none";
  labels[3].style.display = "none";
  document.getElementById("maTH").style.display = "inline";
  document.getElementById("tenTH").style.display = "inline";
  document.getElementById("truSo").style.display = "inline";
  document.getElementById("website").style.display = "inline";
}
function forEdit(div){
    var mortherDiv = div.parentNode.parentNode;
    let src=mortherDiv.getElementsByTagName("img")[0].src;
    document.getElementById("img").src = src;
    document.getElementById("forEditDelete").value = src;
    var texts = mortherDiv.getElementsByTagName("label");
    var labels = document.getElementsByClassName("hiddens");

      labels[0].innerHTML = texts[4].innerHTML;
      document.getElementById("tenTH").value = texts[5].innerHTML;
      document.getElementById("truSo").value = texts[6].innerHTML;
      document.getElementById("website").value = texts[7].innerHTML;
      labels[0].style.display = "inline";
      labels[1].style.display = "none";
      labels[2].style.display = "none";
      labels[3].style.display = "none";
      document.getElementById("maTH").value=texts[4].innerHTML;
      document.getElementById("maTH").style.display = "none";
      document.getElementById("tenTH").style.display = "inline";
      document.getElementById("truSo").style.display = "inline";
      document.getElementById("website").style.display = "inline";
}
function xacNhan() {
  if (document.getElementById("submit").value == "Xóa"){
    let xacNhan = confirm('Xác nhận xóa thương hiệu đã chọn?');
    return xacNhan;
  }
  if (document.getElementById("submit").value == "Thay đổi"){
    let xacNhan = confirm('Xác nhận xóa thương hiệu đã chọn?');
    if(xacNhan)
      document.getElementById("submitReal").click();
  }
  return true;
}

function showImage(event) {
  var file = document.querySelector('input[type=file]').files[0]
  //var file=event.target.files[0];
  var img = document.getElementById("img");
  var reader = new FileReader();

  if (file) {
    reader.readAsDataURL(file);
  }
  reader.onloadend = function() {
    img.src = reader.result;
  }
}
