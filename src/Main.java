void main() {

    System.out.println("Monday:");
    Days Monday = new Days("German", "German", "Maths", "Maths", "Religion", "Religion", "Literature", "Literature");
    System.out.println(Monday.ders1);
    System.out.println(Monday.ders2);
    System.out.println(Monday.ders3);
    System.out.println(Monday.ders4);
    System.out.println(Monday.ders5);
    System.out.println(Monday.ders6);
    System.out.println(Monday.ders7);
    System.out.println(Monday.ders8);

    System.out.println(" ");

    System.out.println("Tuesday:");
    Days Tuesday = new Days("Math", "Math", "English", "English", "Biology", "Biology", "Physics", "Physics");
    System.out.println(Tuesday.ders1);
    System.out.println(Tuesday.ders2);
    System.out.println(Tuesday.ders3);
    System.out.println(Tuesday.ders4);
    System.out.println(Tuesday.ders5);
    System.out.println(Tuesday.ders6);
    System.out.println(Tuesday.ders7);
    System.out.println(Tuesday.ders8);

    System.out.println(" ");

    System.out.println("Wednesday:");
    Days Wednesday = new Days("Math", "Math", "Geography", "Geography", "Guidance", "Biology", "English", "English");
    System.out.println(Wednesday.ders1);
    System.out.println(Wednesday.ders2);
    System.out.println(Wednesday.ders3);
    System.out.println(Wednesday.ders4);
    System.out.println(Wednesday.ders5);
    System.out.println(Wednesday.ders6);
    System.out.println(Wednesday.ders7);
    System.out.println(Wednesday.ders8);

    System.out.println(" ");

    System.out.println("Thursday:");
    Days Thursday = new Days("Chemistry", "Chemistry", "Sports", "Literature", "History", "History", "Art", "Art");
    System.out.println(Thursday.ders1);
    System.out.println(Thursday.ders2);
    System.out.println(Thursday.ders3);
    System.out.println(Thursday.ders4);
    System.out.println(Thursday.ders5);
    System.out.println(Thursday.ders6);
    System.out.println(Thursday.ders7);
    System.out.println(Thursday.ders8);

    System.out.println(" ");

    System.out.println("Friday:");
    Days Friday = new Days("English", "English", "Literature", "Literature", "Sports", "Sports", "Religion", "Religion");
    System.out.println(Friday.ders1);
    System.out.println(Friday.ders2);
    System.out.println(Friday.ders3);
    System.out.println(Friday.ders4);
    System.out.println(Friday.ders5);
    System.out.println(Friday.ders6);
    System.out.println(Friday.ders7);
    System.out.println(Friday.ders8);

    System.out.println(" ");

    Lesson myLessons = new Lesson("Maths", "Alper Turan", "Pages in the book", 100, 100);
    System.out.println(myLessons.name);
    System.out.println(myLessons.teacher);
    System.out.println(myLessons.homework);
    System.out.println(myLessons.exam);
    System.out.println(myLessons.oral);

    System.out.println(" ");

    Lesson myLessons2 = new Lesson("Turkish literature", "Özkan Adıgüzel", "Writing poem", 80, 90);
    System.out.println(myLessons2.name);
    System.out.println(myLessons2.teacher);
    System.out.println(myLessons2.homework);
    System.out.println(myLessons2.exam);
    System.out.println(myLessons2.oral);

    System.out.println(" ");

    Lesson myLessons3 = new Lesson("English", "Duygu Ergen", "Reading a story book", 90, 100);
    System.out.println(myLessons3.name);
    System.out.println(myLessons3.teacher);
    System.out.println(myLessons3.homework);
    System.out.println(myLessons3.exam);
    System.out.println(myLessons3.oral);

    System.out.println(" ");

    Lesson myLessons4 = new Lesson("German", "Şeyma Eser Büyükdere", "Writing a paragraph", 90, 90);
    System.out.println(myLessons4.name);
    System.out.println(myLessons4.teacher);
    System.out.println(myLessons4.homework);
    System.out.println(myLessons4.exam);
    System.out.println(myLessons4.oral);

    System.out.println(" ");

    Lesson myLessons5 = new Lesson("Biology", "Emine Geyik", "Researching living creatures", 85, 100);
    System.out.println(myLessons5.name);
    System.out.println(myLessons5.teacher);
    System.out.println(myLessons5.homework);
    System.out.println(myLessons5.exam);
    System.out.println(myLessons5.oral);

    System.out.println(" ");

    Lesson myLessons6 = new Lesson("Chemistry", "Elif Okumuş", "Pages in the book", 100, 100);
    System.out.println(myLessons6.name);
    System.out.println(myLessons6.teacher);
    System.out.println(myLessons6.homework);
    System.out.println(myLessons6.exam);
    System.out.println(myLessons6.oral);

    System.out.println(" ");

    Lesson myLessons7 = new Lesson("Physics", "Serap Mercan", "Questions in the textbook", 75, 85);
    System.out.println(myLessons7.name);
    System.out.println(myLessons7.teacher);
    System.out.println(myLessons7.homework);
    System.out.println(myLessons7.exam);
    System.out.println(myLessons7.oral);
}
