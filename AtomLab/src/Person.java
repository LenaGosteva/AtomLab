public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    Account account;

    public Person(int id, String name, String surname, int age, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.account = new Account(login, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    protected class Account {
        String login;
        String password;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Account(String login, String password) {
            this.login = login;
            this.password = password;
        }
    }

}
