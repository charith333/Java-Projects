import java.util.*;

public class SocialNetwork {
    private Map<String, Set<String>> adj;

    public SocialNetwork() {
        this.adj = new HashMap<>();
    }

   
    public void addPerson(String name) {
        if (name == null || name.isEmpty()) return;
        adj.putIfAbsent(name, new HashSet<>());
    }

    public void addFriendship(String p1, String p2) {
        if (p1 == null || p2 == null || p1.equals(p2)) return;
        
        addPerson(p1);
        addPerson(p2);
        
        adj.get(p1).add(p2);
        adj.get(p2).add(p1);
    }

    
    public List<String> getFriends(String person) {
        Set<String> friends = adj.get(person);
        if (friends == null) return Collections.emptyList();
        return new ArrayList<>(friends);
    }

    
    public void displayNetwork() {
        for (String person : adj.keySet()) {
            System.out.println(person + " -> " + adj.get(person));
        }
    }
}