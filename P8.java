

class State {
    String txt;
    State prev, nxt;

    State(String txt) {
        this.txt = txt;
        this.prev = this.nxt = null;
    }
}

class TextEditor {
    State cur;
    int lim = 10, cnt = 0;

    void add(String txt) {
        State s = new State(txt);
        if (cur != null) cur.nxt = s;
        s.prev = cur;
        cur = s;
        cnt++;
        if (cnt > lim) trimHist();
    }

    void undo() {
        if (cur != null && cur.prev != null) cur = cur.prev;
    }

    void redo() {
        if (cur != null && cur.nxt != null) cur = cur.nxt;
    }

    void show() {
        System.out.println(cur != null ? " Current: " + cur.txt : "No content.");
    }

    void trimHist() {
        State tmp = cur;
        while (tmp.prev != null && cnt > lim) {
            tmp = tmp.prev;
            cnt--;
        }
        tmp.prev = null;
    }
}

public class P8 {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();

        te.add("Hello");
        te.add("Hello World");
        te.add("Hello World!");
        te.show();

        te.undo();
        te.show();

        te.redo();
        te.show();

        te.undo();
        te.undo();
        te.show();
    }
}
