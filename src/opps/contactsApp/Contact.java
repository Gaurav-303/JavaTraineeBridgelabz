package opps.contactsApp;

class Contact {
    private String name;
    private String phone;
    private String email;
    private String tag;
    private String note;

    public Contact(String name, String phone, String email, String tag, String note) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.tag = tag;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Tag  : " + tag);
        System.out.println("Note : " + note);
        System.out.println("----------------------");
    }

    public void update(String phone, String email, String tag, String note) {
        this.phone = phone;
        this.email = email;
        this.tag = tag;
        this.note = note;
    }
}
