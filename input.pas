{vars
 declaration
 block}
var a1, a2, a3:integer;  b1, b2, b3:integer; c1, c2:char; d1, d2, tmp:double;

{ begin program }
begin

    read(c1);
    readln(c2, c1);
    write(c1, c2);
    if not (c1 > c2) and( c2> c1) or not(1 < 2) then c1 := c2;


    (* reading part *)
    read(a1, a2);
    readln(a3);
    read(c1);
    readln();
    readln(c2);

    (* calculate
        expr    *)
    d1 := a1 * 5674 / 674 - a2 / 56 + a3 /674 - 78 * 90;
    d2 := d1 - a1 + a2;
    tmp := d2;

    (* writing part *)
    write(a1, a2, a3);
    writeln();
    writeln(b1, b2, b3);
    write(d1);
end.