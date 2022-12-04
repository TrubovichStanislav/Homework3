public class Main {
    public static void main(String[] args) {
        //Задание 6
      var boxerOne = 78.2;
      var boxerTwo = 82.7;
      var sumBoxers = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + sumBoxers + " кг");
      var differenceBoxer = boxerOne - boxerTwo;
        System.out.println("Разница между весами бойцов " + Math.abs(differenceBoxer) + " кг");
        System.out.println();

        //Задание 7
        differenceBoxer = boxerTwo - boxerOne ;
        System.out.println("Разница между весами бойцов " + differenceBoxer + " кг");
        differenceBoxer = boxerTwo % boxerOne ;
        System.out.println("Разница между весами бойцов " + differenceBoxer + " кг");
        System.out.println();

        //Задание 8
      var workTime = 640;
      var wordDay = 8;
      var peopleInCompany = workTime/wordDay;
      System.out.println("Всего работников в компании – " + peopleInCompany + " человек");
      peopleInCompany +=94;
      workTime = peopleInCompany * wordDay;
      System.out.println("Если в компании работает " + peopleInCompany + " человека, то всего " + workTime + " часа работы может быть поделено между сотрудниками");
    }
}