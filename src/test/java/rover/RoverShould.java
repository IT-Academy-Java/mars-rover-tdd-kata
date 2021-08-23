package rover;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class RoverShould {

  private Rover rover;

  @Before
  public void initialize(){
    rover = new Rover();
  }

  @Test
  public void rotate_right(){

    assertThat(rover.execute("R"), is("0:0:E"));

  }
}
