package application;

public class Student {
	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    String firstName;

    public String getSurName() {
        return surName;
    }

    String surName;

    public String getBirthDate() {
        return birthDate;
    }

    String birthDate;

    public String getGender() {
        return gender;
    }

    String gender;

    public String getPhotoPath() {
        return photoPath;
    }

    String photoPath;

    public Student(String firstName, String surName, String birthDate, String gender, String photoPath, String mark, String comment) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.photoPath = photoPath;
        this.mark = mark;
        this.comment = comment;
    }

    public String getMark() {
        return mark;

    }

    String mark;

    public String getComment() {
        return comment;
    }

    String comment;


}
