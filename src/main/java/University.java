public class University {
    public static void main(String[] args) {
        MyList list = new MyList();

        EvenLift l01 = new EvenLift();
        EvenLift l02 = new EvenLift();
        EvenLift l03 = new EvenLift();

        OddLift l11 = new OddLift();
        OddLift l12 = new OddLift();
        OddLift l13 = new OddLift();

        PersonalLift p = new PersonalLift();

        list.add(p);
        list.add(l01);
        list.add(l02);
        list.add(l03);
        list.add(l11);
        list.add(l12);
        list.add(l13);


        Node curr = list.current;

        Calling c1 = new Calling(curr, 3, Persona.WORKER);
        Calling c2 = new Calling(curr, 2, Persona.USUAL);
        Calling c3 = new Calling(curr, 5, Persona.WORKER);
        Calling c4 = new Calling(curr, 3, Persona.USUAL);
        Calling c5 = new Calling(curr, 7, Persona.USUAL);
        Calling c6 = new Calling(curr, 8, Persona.USUAL);
        Calling c7 = new Calling(curr, 14, Persona.WORKER);
        Calling c8 = new Calling(curr, 12, Persona.USUAL);
        Calling c9 = new Calling(curr, 15, Persona.USUAL);
        Calling c10 = new Calling(curr, 16, Persona.WORKER);
        Calling c11 = new Calling(curr, 14, Persona.USUAL);
        Calling c12 = new Calling(curr, 13, Persona.USUAL);
        Calling c13 = new Calling(curr, 12, Persona.USUAL);
        Calling c14 = new Calling(curr, 11, Persona.USUAL);
        Calling c15 = new Calling(curr, 2, Persona.WORKER);
        Calling c16 = new Calling(curr, 4, Persona.USUAL);
        Calling c17 = new Calling(curr, 5, Persona.USUAL);
        Calling c18 = new Calling(curr, 3, Persona.USUAL);
        Calling c19 = new Calling(curr, 7, Persona.USUAL);
        Calling c20 = new Calling(curr, 5, Persona.WORKER);


    }
}

/*
Вывод программы:
Personal Lift went to 3 floor
DONE!

Even Lift went to 2 floor
DONE!

Odd Lift went to 5 floor
DONE!

Odd Lift went to 3 floor
DONE!

Odd Lift went to 7 floor
DONE!

Even Lift went to 8 floor
DONE!

Personal Lift went to 14 floor
DONE!

Even Lift went to 12 floor
DONE!

All available lifts are busy!
Even Lift went to 16 floor
DONE!

All available lifts are busy!
All available lifts are busy!
All available lifts are busy!
Odd Lift went to 11 floor
DONE!

Personal Lift went to 2 floor
DONE!

Even Lift went to 4 floor
DONE!

Odd Lift went to 5 floor
DONE!

All available lifts are busy!
Odd Lift went to 7 floor
DONE!

All available lifts are busy!
 */