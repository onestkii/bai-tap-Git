package com.nhom1.canchi;

import java.util.Calendar;

public class CanChiVaTuoi {

	private String Can, Chi;
	private int namSinh, tuoi;

	public CanChiVaTuoi(int namSinh) {
		this.namSinh = namSinh;
	}

	public void TimCanChi() {
		int tinhCan = (namSinh + 7) % 10;
		int tinhChi = (namSinh + 9) % 12;

		switch (tinhCan) {
		case 1:
			Can = " Giap ";

			break;
		case 2:
			Can = " At ";

			break;
		case 3:
			Can = " Binh ";

			break;
		case 4:
			Can = " Dinh ";

			break;
		case 5:
			Can = " Mau";

			break;
		case 6:
			Can = " Ky ";

			break;
		case 7:
			Can = " Canh ";

			break;
		case 8:
			Can = " Tân";

			break;
		case 9:
			Can = " Nham ";

			break;
		case 0:
			Can = " Quy ";

			break;
		}

		switch (tinhChi) {
		case 1:
			Chi = "Ty";

			break;
		case 2:
			Chi = "Su";

			break;
		case 3:
			Chi = "Dan";

			break;
		case 4:
			Chi = "Mao";

			break;
		case 5:
			Chi = "Thin";

			break;
		case 6:
			Chi = "Ty";

			break;
		case 7:
			Chi = "Ngo";

			break;
		case 8:
			Chi = "Mui";

			break;
		case 9:
			Chi = "Than";

			break;
		case 10:
			Chi = "Dau";

			break;
		case 11:
			Chi = "Tuat";

			break;
		case 0:
			Chi = "Hoi";

			break;
		}

		System.out.println(" Nam sinh cua ban thuoc kieu  " + Can + Chi );
	}

	public void TinhTuoi() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		if (namSinh <= 0 || namSinh > year) {
			System.out.println(" Nam sinh khong hop le ");
		} else {
			tuoi = year - namSinh;
			System.out.println(" Tuoi cua ban la: " + tuoi);
		}

	}

}
