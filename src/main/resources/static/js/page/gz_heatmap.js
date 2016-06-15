/**
 * 
 */

var geoCoordMap = {
    "从化市":[113.59286,23.554007],
    "花都区":[113.226783,23.409758],
    "增城市":[113.707065,23.331931],
    "白云区":[113.345156,23.298611],
    "萝岗区":[113.487145,23.187259],
    "荔湾区":[113.227586,23.104229],
    "越秀区":[113.270716,23.135463],
    "天河区":[113.368571,23.130388],
    "海珠区":[113.323465,23.089195],
    "黄埔区":[113.466087,23.112407],
    "番禺区":[113.391089,22.943638],
    "南沙区":[113.531584,22.808383]
};
var convertData = function (data) {
    var res = [];
    for (var i = 0; i < data.length; i++) {
        var geoCoord = geoCoordMap[data[i].name];
        if (geoCoord) {
            res.push(geoCoord.concat(data[i].value));
        }
    }
    return res;
};


var option = {
    title: {
        text: '广州市热线分布图',
        subtext: 'data from 12345',
        sublink: 'http://www.gz.gov.cn',
        left: 'center',
        textStyle: {
            color: '#fff'
        }
    },
    backgroundColor: '#404a59',
    visualMap: {
        min: 0,
        max: 500,
        splitNumber: 5,
        inRange: {
            color: ['#d94e5d','#eac736','#50a3ba'].reverse()
        },
        textStyle: {
            color: '#fff'
        }
    },
    geo: {
        map: '广州',
        label: {
            emphasis: {
                show: true
            }
        },
        roam: true,
        itemStyle: {
            normal: {
                areaColor: '#323c48',
                borderColor: '#111'
            },
            emphasis: {
                areaColor: '#2a333d'
            }
        }
    },
    series: [{
        name: 'RD',
        type: 'heatmap',
        coordinateSystem: 'geo',
        data: convertData([
            {name: "从化市", value: 194},
            {name: "花都区", value: 229},
            {name: "增城市", value: 273},
            {name: "白云区", value: 194},
            {name: "萝岗区", value: 229},
            {name: "荔湾区", value: 273},
            {name: "越秀区", value: 194},
            {name: "天河区", value: 229},
            {name: "海珠区", value: 273},
            {name: "黄埔区", value: 229},
            {name: "番禺区", value: 273},
            {name: "南沙区", value: 279}
        ]),
        itemStyle:{
            normal:{label:{show:true}},
            emphasis:{label:{show:true}}
        }
    }]
};
$(document).ready(function() {
	var myChart = echarts.init(document.getElementById('main'));
	myChart.setOption(option);
}
);
