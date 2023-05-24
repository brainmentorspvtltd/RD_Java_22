import java.util.HashMap;

class NodeDLL {
    int data;
    NodeDLL next, random;
    NodeDLL(int data) {
        this.data = data;
        next = random = null;
    }
}

public class CloneDLL {
    static void clone(NodeDLL head) {
        HashMap<NodeDLL, NodeDLL> map = new HashMap<>();
        for(NodeDLL current = head; current != null; current = current.next) {
            map.put(current, new NodeDLL(current.data));
        }
        for(NodeDLL current = head; current != null; currrent = current.next) {
            NodeDLL cloneCurrent = map.get(current);
            cloneCurrent.next = map.get(current.next);
            cloneCurrent.random = map.get(current.random);
        }
        NodeDLL head_2 = map.get(head);
    }
}

