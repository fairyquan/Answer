package pattern.creation.builder;

class Test {
    public static void main(String[] args) {
        User quan = new User.Builder()
                .setId(1)
                .setName("quan")
                .build();
        System.out.println(quan);
    }
}
