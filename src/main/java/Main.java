public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 23;
        post.birthday.month = 4;
        post.birthday.year = 1996;
        post.name = "Данил";
        post.passport = "4444 № 44444444";
        post.patronymic = "Нечай";
        post.phone = "7_999_999_9999";
        post.surname = "Дмитриевич";
        post.subscription = true;
    }
}