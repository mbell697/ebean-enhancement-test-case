package org.ebean.test.enhance;

import com.avaje.ebean.enhance.agent.Transformer;
import com.avaje.ebean.enhance.ant.OfflineFileTransform;
import com.avaje.ebean.enhance.ant.TransformationListener;

import java.io.File;

public class Main {

  //Strangely this works for both test cases...seems to imply there is some issue with this running in a maven task
  public static void main(String [] args) {
    String classSource = "target/classes";
    String classDestination = "target/classes";
    String transformArgs = "debug=9";
    String packages = "org.ebean.test.enhance";

    File f = new File("");
    System.out.println("Current Directory: " + f.getAbsolutePath());

    Transformer t = new Transformer(classSource, transformArgs);
    ClassLoader cl = Main.class.getClassLoader();

    System.out.println("classSource=" + classSource + "  transformArgs=" + transformArgs
        + "  classDestination=" + classDestination + "  packages="+ packages);

    OfflineFileTransform ft = new OfflineFileTransform(t, cl, classSource, classDestination);
    ft.setListener(new TransformationListener() {

      public void logEvent(String msg) {
        System.out.println(msg);
      }

      public void logError(String msg) {
        System.out.println(msg);
      }
    });
    ft.process(packages);
  }
}
