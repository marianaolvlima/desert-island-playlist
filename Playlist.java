import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new 
    ArrayList<String>();

    desertIslandPlaylist.add("Super by Seventeen");
    desertIslandPlaylist.add("Black Eye by Vernon");
    desertIslandPlaylist.add("Run to You by Seventeen");
    desertIslandPlaylist.add("Wait by Dino");
    desertIslandPlaylist.add("Get a Guitar by RIIZE");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Wait by Dino");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(0);
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.indexOf(0);
    desertIslandPlaylist.indexOf(2);

    String tempA = "Talk Sexy by RIIZE";
    desertIslandPlaylist.set(indexA, "Get a Guitar by RIIZE");
    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  }
  
}