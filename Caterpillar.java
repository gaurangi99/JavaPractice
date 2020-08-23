import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caterpillar {
  Map<String, String> directions = new HashMap<>(8);
  Map<String, Integer> values = new HashMap<>(4);
  List<List<String>> board = new ArrayList<>(20);
  Integer count = 0, x = 0, y = 0;
  String lastMove = null;
  public Caterpillar() {
    this.directions.put("N","|");
    this.directions.put("S","|");
    this.directions.put("E", "-");
    this.directions.put("W","-");
    this.directions.put("NE","/");
    this.directions.put("SW","/");
    this.directions.put("NW","\\");
    this.directions.put("SE","\\");
    this.values.put("N", -1);
    this.values.put("S", 1);
    this.values.put("E", 1);
    this.values.put("W", -1);
    for (int i = 0; i < 20; i++) {
      this.board.add(new ArrayList<>(20));
      for (int j = 0; j < 20; j++) {
        this.board.get(i).add(" ");
      }
    }
  }

  public void correctTheMove(String lastmove, String currentMove) {
    if (lastmove.equals("E") || lastmove.equals("W")) {
      if (currentMove.length()==2){
        this.y+=this.values.get(lastmove);
      }
    } else if (lastmove.equals("SW") || lastmove.equals("SE")) {
      if (currentMove.equals("N")) {
        this.x += this.values.get(String.valueOf(lastmove.charAt(0)));
        this.y += this.values.get(String.valueOf(lastmove.charAt(1)));
      }
    } else if (lastmove.equals("N") || lastmove.equals("S")) {
      if (currentMove.length()==2) {
        this.y-=this.values.get(String.valueOf(currentMove.charAt(1)));
      }
    } else if (lastmove.equals("NW") || lastmove.equals("NE")) {
      if (currentMove.equals("S")) {
        this.x -= this.values.get(String.valueOf(lastmove.charAt(0)));
        this.y -= this.values.get(String.valueOf(lastmove.charAt(1)));
      }
    }
  }

  public void solve(String query) {
    if (this.count==0) {
      board.get(0).set(0, this.directions.get(query));
      this.count+=1;
    } else {
      correctTheMove(this.lastMove, query);
      if (query.length() == 1) {
        if (query.equals("N") || query.equals("S")) this.x+=this.values.get(query);
        else this.y+=this.values.get(query);
        this.board.get(x).set(y, this.directions.get(query));
      } else {
        this.x += this.values.get(String.valueOf(query.charAt(0)));
        this.y += this.values.get(String.valueOf(query.charAt(1)));
        this.board.get(x).set(y, this.directions.get(query));
      }
    }
    this.lastMove = query;
  }

  public static void main(String[] args) throws IOException {
	System.out.println();
    Caterpillar caterpillar = new Caterpillar();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String input = bufferedReader.readLine().trim();
    String[] query;
    String lastMove = null;
    Integer cc;
    while (!input.equals("x")) {
      query = input.split(" ");
      cc = Integer.parseInt(query[0]);
      lastMove = query[1];
      while (cc>0) {
        caterpillar.solve(String.valueOf(query[1]));
        cc-=1;
      }
      //System.out.println(caterpillar.x + " " + caterpillar.y);
      input = bufferedReader.readLine().trim();
    }
    caterpillar.solve(String.valueOf(lastMove));
    caterpillar.board.get(caterpillar.x).set(caterpillar.y, "x");
    for (int i = 0; i < 20; i++) {
    	String temp = String.join("", caterpillar.board.get(i));
        String tempo = temp.replaceAll(" ","");
        if (tempo.length()==0) continue;
        System.out.println("|"+temp+"|");
//      String ans = caterpillar.board.get(i).toString();
//      ans = ans.replaceAll(",","");
//      ans = ans.substring(1, ans.length()-1);
//      String tempo = ans.replaceAll(" ","");
//      if (tempo.length()==0) continue;
//      System.out.println("|"+ans+"|");
    }
  }
}