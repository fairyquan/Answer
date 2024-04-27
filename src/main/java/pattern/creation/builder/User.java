package pattern.creation.builder;

class User {
    private int id;
    private String name;
    private String password;
    private String phone;
    private User(Builder builder){
        id=builder.id;
        name=builder.name;
        password=builder.password;
        phone=builder.phone;
    }
//    public static Builder Builder(){
//        return new Builder();
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public static final class Builder{
        private int id;
        private String name;
        private String password;
        private String phone;
        public Builder(){
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
