package encapsulationandconstructor.counter;

public class Counter {
  /*Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value*/
    int counter;
    int defaultValue;

    public Counter() {
      this.counter = 0;
    }

    public Counter(int counter) {
      this.counter = counter;
      defaultValue = counter;
    }

    public void add(int numberToAdd) {
      this.counter += numberToAdd;
    }

    public void add() {
      this.counter++;
    }

    public int get() {
      return counter;
    }

    public void reset() {
      this.counter = defaultValue;
    }

  }