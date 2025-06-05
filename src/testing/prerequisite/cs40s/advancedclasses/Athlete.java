/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from ONE other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Mr. Wachs
 * @since May 2, 2025, 10:08:59 a.m.
 */
public class Athlete extends Husky implements PermissionForm, Hockey, 
        CheeseRolling
{
    
    private boolean haveForm;       // Encapsulated properties (variables)
    private String opponentName;
    private int homeScore;
    private int opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;    // Encapsulated constants
    private final boolean WE_LOST = false;
    
    
    /**
     * Constructor, set class properties
     * 
     * @param name the name for this athlete
     */
    public Athlete(String name) {
        super();                    // Call super-constructor
        super.name    = name;       // Our inherited property
        opponentName  = "";         // Even protected properties
        opponentScore = 0;
        homeScore     = 0;
        haveForm      = PermissionForm.NOT_SIGNED;  // Using interface property
        champion      = WE_LOST;
    }
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        // To have one constructor method call another class constructor method,
        // you use the keyword "this" with round brackets
        this("Havoc");
    }
         
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Athlete clone() {
        return this;
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has signed the form!");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not (technically this is a  
     * accessor method)
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return haveForm;
    }

    /**
     * A hockey team scoring a point
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void score(String name) {
        System.out.println(name + " has scored");
        if (name.equals(opponentName)) opponentScore++;
        if (name.equals(super.name))   homeScore++;
    }

    /**
     * The passed period of hockey is over
     *
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        String output = "End of period " + period;
        output += " and the score is "   + homeScore;
        output += " for "                + super.name;
        output += " and "                + opponentScore;
        output += " for "                + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name setting the name of the player
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        opponentName = name;
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        if (champion) {
            System.out.println(super.name + " is champion!");
            return WE_WON;
        }
        else if (homeScore >= opponentScore) {
            System.out.println(super.name + " wins!");
            return WE_WON;
        }
        else {
            System.out.println(opponentName + " wins!");
            return WE_LOST;
        }
    }

    /**
     * Start of the cheese rolling dow the hill but we delay for a certain 
     * number of seconds first before people can start rolling
     * 
     * @param seconds the time to delay
     */
    @Override
    public void start(int seconds) {
        System.out.println("Rollers, please wait " + seconds + " seconds!");
    }

    /**
     * To set the level of violence that rollers can have in this game
     * 
     * @param level a descriptor of the level of violence
     */
    @Override
    public void violenceLevel(String level) {
        System.out.println("Cheese rollers, you are " + level);
        champion = WE_WON;
    }
    
}