public interface Call {
    void validate() throws CrowdedException;
    void makeMove(Node n, int wish);
}
