public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Human(String name,int yearOfBirth, String town, String jobTitle){
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null){
            this.town = "Информация не указана";
        }else {
            this.town =town;
        }
        if (jobTitle == null){
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    void acquaintance (){
        System.out.print("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году." +
                " Я работаю на должности " + jobTitle + ". Будем знакомы!");
        System.out.println();
    }
}
