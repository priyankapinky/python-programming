n=int(input("Enter integer:"))
if(n>1):
  for i in range(2,n):
    if(n%i)==0:
      print("it is not prime number")
      break;
    else:
      print("It is prime number")
      break;
else:
  print("not prime number")
