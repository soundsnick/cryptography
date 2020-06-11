#include "pch.h"
#include <iostream>
#include <cmath>
#include <windows.h>
using namespace std;

long long a = -1, g, p, a_private, b_private, a_public, b_public, key, x, end_ans, a_put;
long float end_an;
bool d = true;

int a_pu() {
	a_put = (long long)pow(g, a_public) % p;
	return a_put;
}
int b_pu() {
	b_public = (long long)pow(g, b_private) % p;
	return b_public;
}
int diffie() {
	cout << "please enter g\n";
	cin >> g;
	cout << "\nplease enter p\n";
	cin >> p;
	cout << "\nplease enter first private key\n";
	cin >> a_private;
	a_public = a_pu();
	cout << "first public key " << a_public;
	cout << "nplease enter second private key\n";
	cin >> b_private;
	b_public = b_pu();
	cout <<"\nsecond public key\n" << b_public;
	key = (long long)pow(a_public, b_private) % 31;
	cout << "\nSecret key is " << key <<endl;
	system("pause");
	return 0;
}
int aa() {
	b_public = (long long)pow(g, key) % p;
	return b_public;
}
int bb() {
	b_private = (long long)pow(a_public, key) * a_private % p;
	return b_private;
}
int dec() {
	end_ans = (long long)pow(b_public, a_public);
	cout << end_ans << " " << b_public << " " << a_public << endl;
	end_an = 1 / end_ans;
	cout << end_an << endl;
	end_an = b_private * end_an;
	cout << end_an << endl;
	end_ans = (long long)end_an % p;
	cout << end_ans;
	return 0;
}
int ElGamal(){
	cout << "Encrypt text";
	cout << "please enter g\n";
	cin >> g;
	cout << "please enter p\n";
	cin >> p;
	cout << "please enter x but \n";
	cin >> a_public;
	a_put = a_pu();
	cout << "your public key " << a_put;
	cout << "\nEnter your secret message\n";
	cin >> a_private;
	cout << "Enter session key\n";
	cin >> key;
	b_public = aa();
	b_private = bb();
	cout << "cifer text is " << b_public << b_private << endl;;
	cout << "text decryption";
	system("pause");
	cout << endl;
	dec();
	cout << endl;
	system("pause");
	return 0;
}
int main() {
	while (d == true) {
	system("cls");
	cout << "Diffie-Hellman - [1]\nElGamal -------- [2]";
	cin >> a;
	system("cls");
		switch (a) {
		case 1:
			diffie();
			break;
		case 2:
			ElGamal();
			break;
		case 0:
			d = false;
			break;
		default:
			break;
		}
	}
}
