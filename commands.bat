msiexec /i mysql-5.5.51-win32 /passive
"C:\Program Files (x86)\MySQL\MySQL Server 5.5\bin\MySQLInstanceConfig.exe" -i -q ServiceName=MySQL RootPassword=root ServerType=DEVELOPER DatabaseType=INNODB Port=3306 Charset=utf8
"C:\Program Files (x86)\MySQL\MySQL Server 5.5\bin\mysql.exe" --user=root --password=root < scriptAgenda.sql
jre-8u101-windows-i586.exe /s INSTALLDIR=C:\Java
