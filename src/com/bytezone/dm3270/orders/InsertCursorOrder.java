package com.bytezone.dm3270.orders;

import com.bytezone.dm3270.display.Pen;
import com.bytezone.dm3270.display.Screen;

public class InsertCursorOrder extends Order
{
  public InsertCursorOrder (byte[] buffer, int offset)
  {
    assert buffer[offset] == Order.INSERT_CURSOR;

    this.buffer = new byte[1];
    this.buffer[0] = buffer[offset];
  }

  public InsertCursorOrder ()
  {
    this.buffer = new byte[1];
    this.buffer[0] = Order.INSERT_CURSOR;
  }

  @Override
  public void process (Screen screen)
  {
    Pen pen = screen.getPen ();
    screen.insertCursor (pen.getPosition ());
  }

  @Override
  public String toString ()
  {
    return "IC";
  }
}