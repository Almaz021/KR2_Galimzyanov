public class Calling implements Call {
    Node n;
    int wish;
    int clas;
    int person;

    public Calling(Node n, int wish, Persona person) {
        this.n = n;
        this.wish = wish;
        this.person = person.getValue();
        makeMove(n, wish);
    }

    public void validate() throws CrowdedException {
        for (int i = 0; i < 7; ++i) {
            if (n.value.status.getValue() == 0 & (n.value.classification == clas | (n.value.classification == 2 & person == 1)) & n.value.time == 0) {
                n.value.time = 5;
                n.value.status = Status.BUSY;
                return;
            } else {
                if (n.value.time > 0) {
                    n.value.time -= 1;
                    if (n.value.time == 0) {
                        n.value.status = Status.FREE;
                    }
                }

                n = n.next;
            }
        }
        throw new CrowdedException();


    }

    public void makeMove(Node n, int wish) {
        this.n = n;
        this.wish = wish;
        this.clas = wish % 2;
        try {
            validate();
            this.n.value.goTo(wish);
            System.out.println("DONE!");
            System.out.println();
        } catch (CrowdedException e) {
            System.out.println(e.getMessage());
        }
    }
}
