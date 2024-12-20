/**
 * Decision-Support-Program
 * CS3250 - MSU Fall 2024
 * @Author: Tony Sandoval
 * Description: A data class to hold user input
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decision {
    /**
     * The user will first input a problem statement. Then the user will enter alternatives (decisions)
     * they will be stored in an ArrayList (dynamically shrink or grow)
     * The factors and weights will be added in an arrayList that contains hashmaps
     */

    private String ProblemStatement;

    private List<String> choices; // to hold the different decisions
    private Map<String, Double> factors; // to hold the different factors

    // a dynamic list with a hashmap to represent each alternative with its own set of factors and weights
    private List<HashMap<String, Double>> decisionData = new ArrayList<>();

    // constructor


    public Decision(String problemStatement, List<String> alternatives, Map<String, Double> factors, List<HashMap<String, Double>> decisionData) {
        ProblemStatement = problemStatement;
        this.choices = alternatives;
        this.factors = factors;
        this.decisionData = decisionData;
    }

    public String getProblemStatement() {
        return ProblemStatement;
    }

    public void setProblemStatement(String problemStatement) {
        ProblemStatement = problemStatement;
    }

    public List<String> getAlternatives() {
        return choices;
    }

    public void setAlternatives(List<String> alternatives) {
        this.choices = alternatives;
    }

    public Map<String, Double> getFactors() {
        return factors;
    }

    public void setFactors(Map<String, Double> factors) {
        this.factors = factors;
    }

    public List<HashMap<String, Double>> getDecisionData() {
        return decisionData;
    }

    public void setDecisionData(List<HashMap<String, Double>> decisionData) {
        this.decisionData = decisionData;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Decision{" +
                "ProblemStatement='" + ProblemStatement + '\'' +
                ", alternatives=" + choices +
                ", factors=" + factors +
                ", decisionData=" + decisionData +
                '}';
    }
} // end Decision
