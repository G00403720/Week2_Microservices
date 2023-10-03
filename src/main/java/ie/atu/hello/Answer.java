package ie.atu.hello;

public class Answer {
    String operation = "operation";
    String getOperation = "";
    String total = "total";
    int answer = 0;

    public Answer(String operation, int answer) {
        getOperation = operation;
        this.answer = answer;
    }

    /*
    {
    operation
    "subtract"
    total
    12

    }

     */
}
