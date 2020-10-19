let app = new Vue({
    el: '#app',
    data: {
        material: '',
        originalPosition: '',
        targetPosition: '',
        detailContent: '',
        dataEntity: {}
    },
    mounted: {},
    methods: {
        materialClick: function () {
            app.material = '342X990EFSFE-334';
            app.detailContent = '物料扫码<br/>' +
                '名称规格：xxxxx  特殊颜色凸显<br/>' +
                '单据数量：xx<br/>' +
                '操作员 操作时间' +new Date().toLocaleString();
        },
        originalClick: function () {
            app.originalPosition = 'O888UUEFSEFE-EEFWEF-WEFWEFEW99999';
            app.detailContent = '原始位置<br/>' +
                '名称规格：xxxxx  特殊颜色凸显<br/>' +
                '单据数量：xx<br/>' +
                '操作员 操作时间' +new Date().toLocaleString();
        },
        targetClick: function () {
            app.targetPosition = 'T9FSEFUFE8FWFE';
            app.detailContent = '目标位置\n' +
                '名称规格：xxxxx  特殊颜色凸显\n' +
                '单据数量：xx\n' +
                '操作员 操作时间' + new Date().toLocaleString();
        },
        clearContent: function () {
            app.material = '';
            app.originalPosition = '';
            app.targetPosition = '';
            app.detailContent = '';

        }
    }

})
//只能输入正整数
numberKeydownFun = function(obj) {
    if(obj.value.length == 1) {
        obj.value = obj.value.replace(/[^1-9]/g, '')
    } else {
        obj.value = obj.value.replace(/\D/g, '')
    }
}

numberKeyupFun = function(obj) {
    if(obj.value.length == 1) {
        obj.value = obj.value.replace(/[^1-9]/g, '')
    } else {
        obj.value = obj.value.replace(/\D/g, '')
    }
}

numberPasteFun = function(obj) {
    if(obj.value.length == 1) {
        obj.value = obj.value.replace(/[^1-9]/g, '');
    } else {
        obj.value = obj.value.replace(/\D/g, '');
    }
}
$("#transferCount").keyup(function(){
    numberKeyupFun(this);
})

$("#transferCount").keydown(function(){
    numberKeydownFun(this);
})

$("#transferCount").bind("paste",function(){
    numberPasteFun(this);
})