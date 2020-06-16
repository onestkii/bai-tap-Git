package com.nhom1.ngaythangnam;

public class NgayThangNam {
	private int thang, nam;
	private int soNgay;

	public void nhapThangNam(int gTriThang, int gTriNam) {
		thang = gTriThang;
		nam = gTriNam;
	}

	public void tinhSoNgay() {
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			soNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			soNgay = 30;
			break;
		case 2:
			if(nam%4==0) {
				soNgay = 28;
			}
			else soNgay = 29;
		default:
			System.out.println(" So thang nhap khong hop le ");

			break;
		}
		
	}
		public void inTT() {
			if(soNgay!=0) {
				System.out.println(" So ngay cua thang " + thang + " va nam " + nam + " la: " + soNgay);
			}
			else return;
		}
	
}
