# SeLoko

## Vulnerable SQLite Login Panel

This insecure application was used as a CTF challenge for learning about local databases and APK decompilation

## Credentials
user: rajada

password: guldan37

## How to get credentials

After the attacker gets the APK, he can decompile it using apktool command 
`
apktool d seloko.apk
`
with that, a folder is created containing some files, which can be found a .db file located on the assets folder, which can be opened using
`
sqlite3 assets/databases/database.db
`
Followed by
`
SELECT * FROM users;
`
After login in you should see the string 'UEdTe2ZkeTFnM19nMF9lMGcxM19KZ1N9', which after base64 decode>rot13 you get the flag 'CTF{sql1t3_t0_r0t13_WtF}'

