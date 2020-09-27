package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getAge(){
        if (dateOfBirth == null){
            return -1;
        }
        int age = LocalDate.now().getYear() - dateOfBirth.getYear();
        LocalDate birthDay = LocalDate.of(LocalDate.now().getYear(),dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());
        if(birthDay.isAfter(LocalDate.now())){
            age--;
        }
        return age;
    }

    public boolean allowedToWatchContent(Content content){
        if (content.getMaturityRating().getMinLeeftijd() > getAge()){
            return false;
        }
        else return true;
    }
}
