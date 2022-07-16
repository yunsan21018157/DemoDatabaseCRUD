package sg.edu.rp.c346.id21018157.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable {
    private 	int id;
    private 	String noteContent;

    public Note( int id, String noteContent  ) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {  return id;  }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    //2. toString() allows a simple ListView
    // to be used with a simple ArrayAdapter
    @Override
    public String toString() { return "ID:" + id + ", " + noteContent;  }

}
