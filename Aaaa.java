public class Aaaa {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);

        System.out.println("Размер таблицы: " + hashTable.size()); 
        System.out.println("Значение по ключу 'banana': " + hashTable.get("banana")); 

        hashTable.remove("banana");
        System.out.println("Размер таблицы после удаления: " + hashTable.size()); 

        System.out.println("Таблица пуста? " + hashTable.isEmpty()); 

        hashTable.display(); 
    }
}
