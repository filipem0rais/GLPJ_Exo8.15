import java.util.ArrayList;
import java.util.List;

/**
 * La classe Student représente un étudiant dans un système administratif.
 * Elle contient des informations sur les étudiants.
 * 
 * @author Michael Kolling et David Barnes
 * @version 2008.03.30
 */
public class Student extends Person
{
    private int credits;

    private List<Integer> historicCredits;

    /**
     * Crée un nouvel étudiant avec le nom et le numéro d'identité donnés.
     */
    public Student(String fullName, String studentID)
    {
        super(fullName, studentID);
        credits = 0;
        historicCredits = new ArrayList<Integer>();
    }


    /**
     * Ajoute des crédits à ceux accumulés par l'étudiant.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
        historicCredits.add(additionalPoints);
    }

    /**
     * Renvoie le nombre de crédits accumulés par cet étudiant.
     */
    public int getCredits()
    {
        return credits;
    }

    public void printCredits() {
        for (int i = 0; i < historicCredits.size(); i++) {
            System.out.print(historicCredits.get(i));
            if (i != historicCredits.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + credits);
    }
}
