public class ListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Елена", 22);
        list.insert("Катя", 25);
        list.insert("София", 23);
        list.insertLast("Геннадий", 77);
        System.out.println("Выводим список людей");
        list.display();
        System.out.println();
        System.out.println("Хлопаем Катю");
        list.delete("Катя");
        list.display();
        System.out.println();
        System.out.println("Хлопаем кого-то");
        list.delete();
        list.display();
    }
}
