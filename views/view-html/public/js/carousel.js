function Carousel(){
	return {
		openInNewTab : true,
		img : [],
		delay : 3000,
		autoCarousel : false,
		currImgLeft : 0,
		stretch : true,
		transitionTime : 1000,
		init : function(s){
			if(	typeof(s) === 'undefined' ||
				typeof(s.img) === 'undefined'||
				typeof(s.id) === 'undefined'
			) return false;
			if(typeof(s.openInNewTab) !== 'undefined')
				this.openInNewTab = s.openInNewTab;
			if(typeof(s.delay) !== 'undefined')
				this.delay = s.delay;
			if(typeof(s.autoCarousel) !== 'undefined')
				this.autoCarousel = s.autoCarousel;
			if(typeof(s.transitionTime) !== 'undefined')
				this.transitionTime = s.transitionTime;
			if(typeof(s.stretch) !== 'undefined')
				this.stretch = s.stretch;
			this.targetElement = document.getElementById(s.id);
			for(var i=0;i<s.img.length;i++){
				if( typeof(s.img[i].src) === 'undefined'||
					typeof(s.img[i].target) === 'undefined'
				)return false;
				this.img[i] = {
					src:s.img[i].src,
					target:s.img[i].target
				}
			}
			return true;
		},
		show : function (){
			this.bx = document.createElement('div');
			this.bx.style.width = (this.targetElement.offsetWidth * this.img.length) + 'px';
			this.bx.style.height = '100%';
			this.bx.style.position = 'relative';
			this.bx.style.left = '0px';
			this.targetElement.style.overflow = 'hidden';
			this.bx.style.cssText += '-webkit-transition: all '+ this.transitionTime +'ms ease;-moz-transition: all '+ this.transitionTime +'ms ease;-o-transition: all '+ this.transitionTime +'ms ease;transition: all '+ this.transitionTime +'ms ease;';
			for(var i=0;i<this.img.length;i++){
				this.bx.innerHTML += '<div style="width:' + (this.targetElement.offsetWidth) + 'px;height:100%;display:inline-block;"><a href="'+this.img[i].target+'" ' + (this.openInNewTab?'target="_blank"':'') +'><img src="'+this.img[i].src+'" style="'+(this.stretch?'':'max-')+'width:100%;'+(this.stretch?'':'max-')+'height:100%;"></a></div>';
			}
			this.targetElement.appendChild(this.bx);
			this.currImgNum = 0;
			if(this.autoCarousel){
				var that = this;
				setInterval(function(){
					if(that.autoCarousel)
						that.next();
				},this.delay);
			}
		},
		next : function(func){
			this.currImgLeft -= this.targetElement.offsetWidth;
			this.currImgNum++;
			if(this.currImgLeft <= -(this.targetElement.offsetWidth * this.img.length)){
				this.currImgLeft = 0;
				this.currImgNum = 0;
			}
			this.bx.style.left = this.currImgLeft + 'px';
			if(typeof(func) === 'function'){
				func();
			}
		},
		prev : function(func){
			this.currImgLeft += this.targetElement.offsetWidth;
			this.currImgNum--;
			if(this.currImgLeft >= this.targetElement.offsetWidth){
				this.currImgLeft = -(this.targetElement.offsetWidth * (this.img.length-1));
				this.currImgNum = this.img.length-1;
			}
			this.bx.style.left = this.currImgLeft + 'px';
			if(typeof(func) === 'function'){
				func();
			}
		},
		goto : function(n,func){
			this.currImgLeft = -(this.targetElement.offsetWidth * n);
			this.currImgNum = n;
			if(n>this.img.length-1){
				this.currImgLeft = -(this.targetElement.offsetWidth * (this.img.length-1));
				this.currImgNum = this.img.length-1;
			}else if(n<0){
				this.currImgLeft = 0;
				this.currImgNum = 0;
			}
			this.bx.style.left = this.currImgLeft + 'px';
			if(typeof(func) === 'function'){
				func();
			}
		}
	}
}

