import pythagorean.packageTest

val p = new packageTest
println(p.cal(3,4))
println(p.area(3,4))
assert(p.cal(3,4) == 5)
assert(p.area(3,4) == 6)