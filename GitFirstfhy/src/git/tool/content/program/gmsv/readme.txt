文件说明<br />
gmsv&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;魔力宝贝的游戏主引擎 <br />
Dengon&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;文件夹下面的全是游戏里的公告版的内容,可以删除. <br />
setup.cf&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 服务端的一些相关设置.具体请参考.<br />
log&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;文件夹下的是服务端日志储存,包括了宠物、道具、说话、钱等等的日志 <br />
data&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;文件夹下面都是一些比较重要的脚本文件<br />
aboutfile.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;游戏简介里面的内容 <br />
badmsg.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;禁止的语言 <br />
cash.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 一些首饰属性的定义文件 <br />
debugger.txt GM&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;设置文件,写入帐号后重启游戏就可以成为GM<br />
enemytalk.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;怪物战斗的时候说的话,对应msg.txt脚本的 <br />
group.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;怪物出现的对形定义 <br />
houseroom.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;房子文件设置 <br />
dungeonconf.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;随机迷宫的相关参数 <br />
encount.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 怪物出现的地图范围的脚本 <br />
enemy.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;宠物等级掉落物品、可以偷窃的物品设置文件.刷宠物就是用这里的代码<br />
version.conf&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;服务端的版本号，在这里设置一个数字，然后在CG文件修改好对应的数字，就只有这个登录器可以登录你的游戏 <br />
enemyai.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 怪物释放技能的定义 <br />
enemybase.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;怪物的五围抗性等相关参数脚本 <br />
itemmaterial.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;宝石及Q零件属性设置脚本 <br />
itemset.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 道具属性定义脚本&nbsp;&nbsp;<br />
jobs.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 职业相关!阶级时NPC调用此文件来判断你是否达到jobs.txt里的要求 <br />
jobsancestry.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;职业相关!设置职业转数.(普通端里最高为7转) <br />
msg.txt npc&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 对话脚本 <br />
npc.txt NPC&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 参数定义脚本 <br />
petmailimpossible.txt&nbsp; &nbsp;宠物可邮件的地图 <br />
ridepet.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 骑宠文件脚本 <br />
skillexp.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;技能升级所需要的经验脚本<br />
group.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;有某道具才能遇到怪和没有某道具才能遇到怪 warp.txt 传送脚本<br />
ship.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 有关船的脚本文件 <br />
skill.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;技能脚本.与tech.txt有关系 <br />
skilllv.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 各职业的技能限制脚本 <br />
tech.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 各技能的参数脚本,包含了所有的技能 <br />
titleconfig.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;称号参数脚本,包含了各种职业称号.永久称号,佩戴道具时获得的称号. <br />
effect.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;设置漂浮物 <br />
encount.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 设置遇敌<br />
titlename.txt&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;称号名称脚本&nbsp;&nbsp;<br />
map&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;文件夹里都是地图文件,玩家只要走到这个地图,存放在这里的文件会被玩家自动下载. <br />
npc&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;文件夹里面是所有的任务脚本<br />
boxcontains&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 是宝箱里开出物品<br />
<br />

时间类型<br />
0--全天（不刷新，固定在原地不变）<br />
1--清晨<br />
2--白天<br />
4--黄昏<br />
8--夜晚<br />
3---清晨+白天<br />
5---清晨+黄昏<br />
9---夜晚+清晨<br />
6---白天+黄昏<br />
10--白天+夜晚<br />
12--黄昏+夜晚<br />
7---清晨+白天+黄昏<br />
11--清晨+白天+夜晚<br />
13--清晨+黄昏+夜晚<br />
14--白天+黄昏+夜晚<br />
15--全天<br />
（1～15的情况，在时间满足要求的第一瞬间NPC会根据前面指定的坐标范围刷新）<br />
<br />

武器类型<br />
0空手<br />
1劍<br />
2斧<br />
3槍<br />
4弓<br />
5仗<br />
6迴力<br />
7小刀<br />
16是弓<br />
143是近身武器<br />
159是近身武器+弓<br />
128是空手<br />
120是远程武器+空手和弓<br />
112是远程武器+弓<br />
135是近身武器+空手<br />
64是远程武器<br />
255是任意武器+空手<br />
<br />

<a href="http://bbs.mocwww.com/viewthread.php?tid=26705&extra=page%3D6">来源</a>
<a href="http://atlantis.cgsword.com/index.php">附录1</a>
<a href="http://bbs.mocwww.com/viewthread.php?tid=26705&extra=page%3D6">附录2</a>
<a href="http://cgdev.me/">附录3</a>