package ss17.src;

    import java.util.*;

    class Contact {
        private static int idCounter = 1;
        private int id;
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.id = idCounter++;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Contact contact = (Contact) obj;
            return Objects.equals(phoneNumber, contact.phoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(phoneNumber);
        }

        @Override
        public String toString() {
            return "Contact{id=" + id + ", name='" + name + "', phoneNumber='" + phoneNumber + "'}";
        }
    }

    class PhoneBook {
        private Set<Contact> contacts;

        public PhoneBook() {
            this.contacts = new HashSet<>();
        }

        public boolean addContact(String name, String phoneNumber) {
            Contact newContact = new Contact(name, phoneNumber);
            if (contacts.contains(newContact)) {
                System.out.println(" Số điện thoại " + phoneNumber + " đã tồn tại!");
                return false;
            }
            contacts.add(newContact);
            System.out.println(" Đã thêm liên lạc: " + newContact);
            return true;
        }

        public boolean removeContact(String phoneNumber) {
            Contact contactToRemove = null;
            for (Contact c : contacts) {
                if (c.getPhoneNumber().equals(phoneNumber)) {
                    contactToRemove = c;
                    break;
                }
            }
            if (contactToRemove != null) {
                contacts.remove(contactToRemove);
                System.out.println("🗑 Đã xóa liên lạc: " + contactToRemove);
                return true;
            } else {
                System.out.println("⚠ Không tìm thấy liên lạc với số " + phoneNumber);
                return false;
            }
        }

        public Contact findContact(String phoneNumber) {
            for (Contact c : contacts) {
                if (c.getPhoneNumber().equals(phoneNumber)) {
                    return c;
                }
            }
            return null;
        }

        public void displayContacts() {
            if (contacts.isEmpty()) {
                System.out.println(" Danh bạ trống.");
            } else {
                System.out.println(" Danh sách liên lạc:");
                for (Contact c : contacts) {
                    System.out.println(c);
                }
            }
        }

        public List<Contact> getPaginatedContacts(int page, int pageSize) {
            List<Contact> sortedContacts = new ArrayList<>(contacts);
            sortedContacts.sort(Comparator.comparing(Contact::getName));

            int fromIndex = (page - 1) * pageSize;
            int toIndex = Math.min(fromIndex + pageSize, sortedContacts.size());

            if (fromIndex >= sortedContacts.size()) {
                return new ArrayList<>();
            }
            return sortedContacts.subList(fromIndex, toIndex);
        }
    }

    public class bt10 {
        public static void main(String[] args) {
            PhoneBook phoneBook = new PhoneBook();

            phoneBook.addContact("Alice", "123456789");
            phoneBook.addContact("Bob", "987654321");
            phoneBook.addContact("Charlie", "555666777");
            phoneBook.addContact("Alice", "123456789"); // Trùng số
            phoneBook.displayContacts();
            phoneBook.removeContact("987654321");
            Contact found = phoneBook.findContact("555666777");
            if (found != null) {
                System.out.println(" Tìm thấy liên lạc: " + found);
            } else {
                System.out.println(" Không tìm thấy liên lạc.");
            }
            System.out.println("\n Danh bạ trang 1 (2 liên lạc mỗi trang):");
            List<Contact> page1 = phoneBook.getPaginatedContacts(1, 2);
            for (Contact c : page1) {
                System.out.println(c);
            }
        }
    }
