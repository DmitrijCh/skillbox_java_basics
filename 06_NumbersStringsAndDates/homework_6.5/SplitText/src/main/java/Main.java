public class Main {
    public static void main(String[] args) {
        System.out.println(splitTextIntoWords("Walking, running, cycling and playing football are some kinds of sports that you do every day." +
                " Some people think that doing sports is useless, the other consider that it is tiring. So, why is it so important to do sports?\n" +
                "\n" +
                "When you move, 600 muscles in your body work to make you more flexible and stronger. " +
                "Sports are very important for children and teenagers. When their bones are well held by the muscles, they grow and become stronger.\n" +
                "\n" +
                "Sports maintain the whole body: your brain, your lungs, and your heart." +
                " For doing that your body uses your fats and your sugar. You get more healthy and slimmer. " +
                "That’s not all. You develop your abilities such as catching a ball or keeping balance when you ride a bike." +
                " You learn new skills which are useful in your life. You get more successful and progress-oriented.\n" +
                "\n" +
                "When you are doing sports, your brain makes a pleasure hormone — endorphin." +
                " It makes you forget your anger and your sorrows." +
                " Moreover the sport is often done with friends or family, and it is a good way to share emotions and joy.\n" +
                "\n" +
                "You can do sports on the ground, in the water or in the air. " +
                "There are dozens of sport activities where you will meet different people." +
                " But all of them have the only passion, and it is sports. Besides, doctors advise to spend an hour for sports every day." +
                " Are you ready for the challenge?"));
    }

    public static String splitTextIntoWords(String text) {
        final String[] words;
        words = text.replaceAll("-", " ").replaceAll("[^A-Za-z\\s’]", "")
                .replaceAll("\\s{2}", " ").trim().split(" ");
        text = String.join("\n", words);
        return text;
    }
}