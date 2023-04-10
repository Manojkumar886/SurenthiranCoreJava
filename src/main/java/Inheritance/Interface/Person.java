package Inheritance.Interface;

public class Person implements Sleepable,Speakable,Walkable
{

    @Override
    public void Sleep()
    {
        System.out.println("Sleep is a state of reduced mental and physical activity, in which consciousness is altered, and sensory activity is inhibited to a certain extent. During sleep, there is a decrease in muscle activity, and interactions with the surrounding environment are significantly reduced.");
    }

    @Override
    public void speack()
    {
        System.out.println("What is the meaning of speak spoken?\n" +
                "verb speaks, speaking, spoke or spoken. to make (verbal utterances); utter (words) to communicate or express (something) in or as if in wordsI speak the truth. (intr) to deliver a speech, discourse, etc.");
    }

    @Override
    public void Walk()
    {
        System.out.println("move at a regular pace by lifting and setting down each foot in turn, never having both feet off the ground at once.");
    }

    public static void main(String[] args) {
        Person per=new Person();
        per.Sleep();
        per.speack();
        per.Walk();

//        Sleepable obj=new Sleepable() {
//            @Override
//            public void Sleep() {
//
//            }
//        }
    }
}
