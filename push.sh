# ȷ���ű��׳������Ĵ���
set -e
 
# ��ȡ��ǰʱ��
now=$(date "+%Y-%m-%d%H:%M")
 
echo "�����ϴ�Դ����..."
 
git add .
git commit -m "�����ύ$now"
git push
echo "�ϴ����"
# ����git������������������
 
cd -