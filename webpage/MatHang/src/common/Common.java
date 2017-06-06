package common;

import java.io.File;

public class Common {
	public static boolean xoaAnh(String src, String path){

	    //create the upload folder if not exists
	    File folder = new File(path);
	    if(folder.exists()){
	
		    String fileName = getTenAnh(src);
		    File fileAnh = new File(path,fileName);
		    System.out.println(fileAnh.getName()+"666"+fileAnh.getPath());
		    if(fileAnh.exists()){
		    	fileAnh.delete();
		    	return true;
		    }
	    }
	    return false;
	}

	private static String getTenAnh(String src) {
		// TODO Auto-generated method stub
		int lenth=src.length();
		for(int i=lenth-1;i>=0;i--)
			if(src.charAt(i)=='/')
				return src.substring(i+1);
		return "";
	}
	public static void main(String[] args) {
		System.out.println(xoaAnh("http://localhost:8080/MatHang/images/230155-blue-mountains-1-1000-e68b1a8ec8-1478510766.jpg","D:\\ComputingPrac\\EclipseWorkPlace\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\MatHang\\images"));
	}
}