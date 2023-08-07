package java_study.chapter03;

import javax.swing.JOptionPane;

public class Logic03 {
	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";

		String inputId = JOptionPane.showInputDialog("아이디 입력");
		String inputPw = JOptionPane.showInputDialog("패스워드 입력");

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");

		}
	}

}
