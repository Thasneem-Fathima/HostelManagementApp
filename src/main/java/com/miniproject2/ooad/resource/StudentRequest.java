//package com.miniproject2.ooad.resource;
//
//public class StudentRequest {
//
//
//    private int s_id;
//
//    public int a_id;
//
//    private String s_name;
//
//    private int regno;
//
//    private String password;
//
//    private int year;
//
//    private String dept;
//
//    private String ad_status;
//
//    private String pay_status;
//
//    private int r_id;
//
//    public StudentRequest() {
//    }
//
//    public StudentRequest(int s_id, int a_id, String s_name, int regno, String password, int year, String dept, String ad_status, String pay_status, int r_id) {
//        this.s_id = s_id;
//        this.a_id = a_id;
//        this.s_name = s_name;
//        this.regno = regno;
//        this.password = password;
//        this.year = year;
//        this.dept = dept;
//        this.ad_status = ad_status;
//        this.pay_status = pay_status;
//        this.r_id = r_id;
//    }
//
//    public int getS_id() {
//        return s_id;
//    }
//
//    public void setS_id(int s_id) {
//        this.s_id = s_id;
//    }
//
//    public int getA_id() {
//        return a_id;
//    }
//
//    public void setA_id(int a_id) {
//        this.a_id = a_id;
//    }
//
//    public String getS_name() {
//        return s_name;
//    }
//
//    public void setS_name(String s_name) {
//        this.s_name = s_name;
//    }
//
//    public int getRegno() {
//        return regno;
//    }
//
//    public void setRegno(int regno) {
//        this.regno = regno;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    public String getAd_status() {
//        return ad_status;
//    }
//
//    public void setAd_status(String ad_status) {
//        this.ad_status = ad_status;
//    }
//
//    public String getPay_status() {
//        return pay_status;
//    }
//
//    public void setPay_status(String pay_status) {
//        this.pay_status = pay_status;
//    }
//
//    public int getR_id() {
//        return r_id;
//    }
//
//    public void setR_id(int r_id) {
//        this.r_id = r_id;
//    }
//}
package com.miniproject2.ooad.resource;

import org.springframework.web.multipart.MultipartFile;

public class StudentRequest {


    private String s_name;

    private int regno;

    private String password;

    private int year;

    private String dept;

    private String ad_status;

    private String pay_status;

    public int roomno;

    public int ano;

    private MultipartFile applicationForm;
    private MultipartFile feeReceipt;
    private MultipartFile sopForm;
    private MultipartFile covid19Undertaking;
    private MultipartFile vaccinationCertificate;
    public StudentRequest() {
    }

    public StudentRequest(String s_name, int regno, String password, int year, String dept, String ad_status, String pay_status, int roomno, int ano) {
        this.s_name = s_name;
        this.regno = regno;
        this.password = password;
        this.year = year;
        this.dept = dept;
        this.ad_status = ad_status;
        this.pay_status = pay_status;
        this.roomno = roomno;
        this.ano=ano;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAd_status() {
        return ad_status;
    }

    public void setAd_status(String ad_status) {
        this.ad_status = ad_status;
    }

    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}