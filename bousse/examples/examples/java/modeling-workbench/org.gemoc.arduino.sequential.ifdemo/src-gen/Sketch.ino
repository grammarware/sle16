int BlueLED = 1;
int RedLED = 5;
int WhiteLED = 3;
// dfrobot/push_button.jpg
int Pushbutton1 = 0; 
int iter_2;

short unsigned int var0;

void setup() {
  pinMode(BlueLED, OUTPUT);
  pinMode(RedLED, OUTPUT);
  pinMode(WhiteLED, OUTPUT);

var0 = false;
}

// the loop routine runs over and over again forever:
void loop() {
 {//IF
 	int Pushbutton1_value = digitalRead(Pushbutton1);
 	if ((Pushbutton1 == false))
 	{
 	 for (iter_2=0; iter_2 < ( 2 ); ++iter_2 )
 	 {
 	  digitalWrite(BlueLED, 1023);
 	  digitalWrite(RedLED, HIGH);
 	  digitalWrite(WhiteLED, HIGH);
 	  delay(1000);
 	  digitalWrite(WhiteLED, LOW);
 	  digitalWrite(RedLED, HIGH);
 	  digitalWrite(BlueLED, HIGH);
 	  delay(1000);
 	  digitalWrite(BlueLED, HIGH);
 	  digitalWrite(RedLED, LOW);
 	  digitalWrite(WhiteLED, HIGH);
 	 }
 	 {
 	 	int BlueLED_value = digitalRead(BlueLED);
 	 	while (BlueLED)
 	 	{
 	 	 digitalWrite(BlueLED, HIGH);
 	 	 delay(100); 
 	 	}
 	 }
 	}
 //endIf
 }
}
