package org.ebean.test.enhance;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TestEntity {
  public List<TestNonEntity> test() {
    List<TestNonEntity> result = new ArrayList<TestNonEntity>();
    TestNonEntity match = null;
    for (TestNonEntity t: result) {

    }
    if (match == null) {

    } else {
        TestNonEntity pli = new TestNonEntity();
    }

    return result;
  }
}
