package lv.rvt;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonManager manager = new PersonManager();
        manager.run();
    }





        // int [] intArr = {5, 4, 3, 7, 6, 2};
        // double [] doubleArr = {5.6, 4.4, 3.3, 1.8, 2.0};
        // String [] stringArr = {"aa", "cc", "bb", "ff", "ee", "dd"};

        // //Parastā masīva printēšana
        // System.out.println(
        //     Arrays.toString(stringArr)
        // );
        // //Masīva kārtošana (sort)
        // Arrays.sort(stringArr);

        // System.out.println(
        // Arrays.toString(stringArr)
        // );

        // ArrayList<Person> personList = new ArrayList();
        
        // personList.add(new Person("John", "Riga"));
        // personList.add(new Person("Andrejs", "Liepāja"));
        // personList.add(new Person("Pablo", "Cesis"));
        // personList.add(new Person("Cuba", "Salaspils"));

        // //Sort by name vai nu sort by address

        // for (Person person : personList){
        //     System.out.println(person.getAddress());
        // }
        // System.out.println("==========================================================");
        // //Person objektu sortošana pēc lauka name
        // personList.sort(Comparator.comparing(Person::getAddress));

        // //Pārbaudam rezultātu pēc sortošanas
        // for (Person person : personList){
        //     System.out.println(person.getAddress());
        // }

        // //Filtrēšana
        // int [] intArr2 = {5, 4, 3, 7, 6, 2};
        // String [] stringArr2 = {"uuiiae", "eehhh", "bbno", "zzmimi", "sigma", "nnii"};

        // for (int i : intArr2){
        //     if (i<5){
        //         //Kaut ko izdaram ar elementiem kuri ir mazāki par 5
        //     }
        // }

        // for (String value : stringArr2) {
        //     if (value.contains("sig")){
        //             System.out.println(value);
        //     }
        // }
    }
